import os
import sys
import time
import re
import urllib.request
import requests

foods = {
    "mercimek_corbasi": "mercimek çorbası",
    "ezogelin_corbasi": "ezogelin çorbası",
    "domates_corbasi": "domates çorbası",
    "tavuk_suyu_corba": "tavuk suyu çorba",
    "izgara_tavuk": "ızgara tavuk porsiyon",
    "kofte": "köfte porsiyon",
    "tavuk_sote": "tavuk sote",
    "etli_nohut": "etli nohut yemeği",
    "karniyarik": "karnıyarık",
    "manti": "mantı",
    "zeytinyagli_yesil_fasulye": "zeytinyağlı yeşil fasulye",
    "imam_bayildi": "imam bayıldı",
    "menemen": "menemen",
    "kisir": "kısır",
    "firin_sebze": "fırında sebze",
    "pizza": "pizza",
    "pide": "kıymalı pide",
    "borek": "su böreği",
    "pogaca": "poğaça",
    "gozleme": "gözleme",
    "pirinc_pilavi": "pirinç pilavı",
    "bulgur_pilavi": "bulgur pilavı",
    "spagetti_bolonez": "spaghetti bolognese",
    "fettuccine_alfredo": "fettuccine alfredo",
    "omlet": "omlet",
    "pankek": "pankek",
    "avokado_tost": "avocado toast",
    "kek": "dilim kek",
    "kurabiye": "kurabiye",
    "sutlac": "fırın sütlaç"
}

def get_bing_image_urls(query, max_results):
    url = f"https://www.bing.com/images/search?q={urllib.parse.quote(query)}&form=HDRSC3"
    headers = {"User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36"}
    try:
        response = requests.get(url, headers=headers, timeout=10)
        html = response.text
        # extract 'murl' from json-like objects in the html
        links = re.findall(r'murl&quot;:&quot;(.*?)&quot;', html)
        if not links:
            links = re.findall(r'"murl":"(.*?)"', html)
        return list(dict.fromkeys(links))[:max_results]
    except Exception as e:
        print(f"Error searching {query}: {e}")
        return []

base_dir = "food"
os.makedirs(base_dir, exist_ok=True)

# Note: Using max_results per class
max_results = int(sys.argv[1]) if len(sys.argv) > 1 else 250

for folder, keyword in foods.items():
    print(f"[{folder}] aranıyor ve indiriliyor (Hedef: {max_results} resim)...")
    save_dir = os.path.join(base_dir, folder)
    os.makedirs(save_dir, exist_ok=True)
    
    urls = get_bing_image_urls(keyword, max_results)
    print(f"  Bulunan benzersiz URL sayısı: {len(urls)}")
    
    count = 0
    for idx, url in enumerate(urls):
        try:
            ext = url.split('.')[-1][:4].split('?')[0]
            if ext.lower() not in ['jpg', 'jpeg', 'png', 'webp']:
                ext = 'jpg'
            filename = f"{idx+1:03d}.{ext}"
            filepath = os.path.join(save_dir, filename)
            
            # download
            req = requests.get(url, stream=True, timeout=5)
            if req.status_code == 200:
                with open(filepath, 'wb') as f:
                    for chunk in req.iter_content(1024):
                        f.write(chunk)
                count += 1
            
            if count % 10 == 0 and count > 0:
                print(f"  İndirilen: {count}")
                
        except Exception:
            continue
    
    print(f"  Toplam indirilen {folder}: {count}/{len(urls)}")
    time.sleep(1) # delay to avoid blocking
