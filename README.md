# Raspberry_Camera_Software

## RPC_to_Server ver0.9

Server.py
Client.py

## RPC_to_Telegram ver0.9
Pyhton_telegram.py

## 텔레그램 bot 이용하기 이미지 추출하기

### Telegram 에서 bot 계정생성

- botfather 검색

  ![connection](https://github.com/OKCOMTECH/Raspberry_SensorKit/blob/master/png/telegrambot1.jpg)
  
- 계정생성 시작 (/start)

  ![connection](https://github.com/OKCOMTECH/Raspberry_SensorKit/blob/master/png/telegrambot2.jpg)
  
- 계정네임 지정 ( uname_bot)

  ![connection](https://github.com/OKCOMTECH/Raspberry_SensorKit/blob/master/png/telegrambot3.jpg)

- HTTP API Token

  ![connection](https://github.com/OKCOMTECH/Raspberry_SensorKit/blob/master/png/telegrambot4.jpg)
  
### python_telegram.py 소스코드 수정

```python
91: updater = Updater(" xyz ") 
: " xyz " (위에서 생성한 Token 으로 대체)
```

### 이미지를 전송할 Telegram User Chat ID 설정

- userinfobot 검색

  ![connection](https://github.com/OKCOMTECH/Raspberry_SensorKit/blob/master/png/telegrambot5.jpg)
  
- 사용자 Chatid 검색 (/start)

  ![connection](https://github.com/OKCOMTECH/Raspberry_SensorKit/blob/master/png/telegrambot6.jpg)
  
### python_telegram.py 소스코드 수정
  
```python
53: chat_id = 해당 봇에 아이디로 설정
```

### 실행

  ![connection](https://github.com/OKCOMTECH/Raspberry_SensorKit/blob/master/png/telegrambot7.jpg)

```python
/start 실행방법 표시
/set <seconds> 이미지 촬영 타이머 설정
ex) /set 1 1초후 이미지 추출
```
