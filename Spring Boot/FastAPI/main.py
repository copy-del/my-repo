#!/usr/bin/env python
# coding: utf-8

# anaconda prompt 창 켜서 > 해당 경로 이동 (cd)
# 실행명령어 uvicorn main:app --reload

# # 필요한 라이브러리 설치
# - fastAPI : python쪽에 요청을 처리할 수 있는 서버를 로드하는 라이브러리(flask 라이브러리와 유사)
# - uvicorn : 서버 재요청을 할 때마다, 서버를 자동으로 재부팅 해주는 라이브러리

# In[1]:


# get_ipython().system('pip install fastapi')

# In[3]:


# get_ipython().system('pip install uvicorn[standard]')


# In[10]:


# get_ipython().system('pip install nbconvert')


# # Fast API 사용하기

# In[6]:


# 1. 라이브러리 가져오기
from fastapi import FastAPI

# 동일 출처 정책을 풀어줄 수 있는 설정을 잡아보자
from fastapi.middleware.cors import CORSMiddleware
from selenium import webdriver as wb
from selenium.webdriver.common.by import By

# In[ ]:
# 크롤링 함수 > 함수화 하지 말고 모듈을 분리하는것 공부해보기.
def crawling(search):
    driver = wb.Chrome()
    driver.get(f"https://search.naver.com/search.naver?ssc=tab.image.all&where=image&sm=tab_jum&query={search}")
    driver.implicitly_wait(5)
    
    img = driver.find_element(By.CSS_SELECTOR, "#main_pack > section > div.api_subject_bx._fe_image_tab_grid_root.ani_fadein > div > div > div.image_tile._fe_image_tab_grid > div:nth-child(1) > div > div > div > img")
    img_src = img.get_attribute("src")
    
    driver.quit()
    
    return img_src

# 2. FastAPI를 기반으로 한 APP 생성
app = FastAPI()

# app : controller. app에 middleware를 끼운다 > CORS 정책을 풀어주려고
app.add_middleware(
    CORSMiddleware,
    # 접근 허용할 출처
    allow_origins = ["http://localhost:8090"],
    allow_methods = ["*"],
    allow_headers = ["*"],
    allow_credentials = True
)

# 3. 요청을 할 수 있는 url - 함수를 생성
@app.get("/temp")
# 수집해야하는 데이터가 있다면, parameter로 받아오면 된다.
# parameter의 이름은 보내주는 data의 key값과 일치해야한다.
def temp(sendData):
    print("data" + sendData )
    img_src = crawling(sendData)
    return {"img_src":img_src}


# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:




