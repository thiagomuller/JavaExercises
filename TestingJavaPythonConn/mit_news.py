from bs4 import BeautifulSoup
from urllib2 import urlopen
import datetime
import json

def mit_news_scraper():
    result = {}
    response = ['firstUrl','secondUrl']
    result['urls'] = response
    return json.dumps(result)


if __name__ == '__main__':
    print(mit_news_scraper())
