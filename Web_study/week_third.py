import requests
from bs4 import BeautifulSoup
#파이썬에서 크롤링을 하기 위해서 requests 임포트 해줘야하고 
#뷰티풀 숩을 통해서 임포트를 하는 방법

headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
data = requests.get(  "https://www.genie.co.kr/chart/top200?ditc=M&rtm=N&ymd=20230101" ,headers=headers)
#request(라이브러리) 글래스에서 get 메소드를 통해서 ('크롤링 할 웹 페이지를 적어주는 형식')

soup = BeautifulSoup(data.text, 'html.parser')
#크롤링 할 웹사이트에서 html파일을 변수에 저장

song_lists = soup.select("#body-content > div.newest-list > div > table > tbody > tr")
#웹사이트에서 id 값을 설정해주고 div 태그안에 리스트들 안 테이블 테이블 바디에 있는 각각의 테이블 로우를 가져온다

for rows in song_lists: #테이블로우를 반복문으로 순회를 하고 rows 라는 객체로 순회하는 데이터를 받아 온다.
    num = rows.select_one("td.number").text[0:2].strip()#노래의 이름을 num 변수에 저장을 하고 select_one이라는 메소드를 통해서 html 태그 td의 number 클래스에 있는 번호를 가져온다
    name =rows.select_one("td.info > a.title.ellipsis").text.strip()#노래의 제목은 a.title.ellipsis라는 클래스 명을 참조를 해서 가져온다. 참조할 때 공백은 (".")점으로 참조할 이름을 쓴다.
    singer = rows.select_one("td.info > a.artist.ellipsis").text#가수 이름을 singer라는 변수에 저장을 하고 위와 같이 스크래핑 데이터를 저장한다.
    print(num + ":" + name + ":" + singer)
