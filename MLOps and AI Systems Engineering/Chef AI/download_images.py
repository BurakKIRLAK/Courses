import os
import sys
from icrawler.builtin import BingImageCrawler

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

base_dir = "food"
os.makedirs(base_dir, exist_ok=True)

# PDF states 300 images to be crawled for 250 target images.
max_num = int(sys.argv[1]) if len(sys.argv) > 1 else 300

for folder, keyword in foods.items():
    print(f"[{folder}] için '{keyword}' aranıyor ve indiriliyor...")
    save_dir = os.path.join(base_dir, folder)
    os.makedirs(save_dir, exist_ok=True)
    
    crawler = BingImageCrawler(
        storage={'root_dir': save_dir},
        downloader_threads=4
    )
    # Applying size filter to avoid tiny thumbnails
    filters = {'size': 'large'}
    try:
        crawler.crawl(keyword=keyword, filters=filters, max_num=max_num)
    except Exception as e:
        print(f"Hata oluştu: {e}")
