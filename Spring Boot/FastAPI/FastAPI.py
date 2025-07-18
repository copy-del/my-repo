#!/usr/bin/env python
# coding: utf-8

# # 필요한 라이브러리 설치
# - fastAPI : python쪽에 요청을 처리할 수 있는 서버를 로드하는 라이브러리(flask 라이브러리와 유사)
# - uvicorn : 서버 재요청을 할 때마다, 서버를 자동으로 재부팅 해주는 라이브러리

# In[1]:


get_ipython().system('pip install fastapi')


# In[3]:


get_ipython().system('pip install uvicorn[standard]')


# In[10]:


get_ipython().system('pip install nbconvert')


# # Fast API 사용하기

# In[6]:


# 1. 라이브러리 가져오기
from fastapi import FastAPI


# In[16]:


# 2. FastAPI를 기반으로 한 APP 생성
app = FastAPI()

# 3. 요청을 할 수 있는 url - 함수를 생성
@app.get("/temp")
def temp():
    return "success"


# In[12]:


# 동일 출처 정책을 풀어줄 수 있는 설정을 잡아보자
from fastapi.middleware.cors import CORSMiddleware


# In[18]:


# app : controller. app에 middleware를 끼운다 > CORS 정책을 풀어주려고
app.add_middleware(
    CORSMiddleware,
    # 접근 허용할 출처
    allow_origins = ["http://localhost:8090"],
    allow_methods = ["*"],
    allow_headers = ["*"],
    allow_credentials = True
)


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




