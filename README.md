# RaspberryPi setting

## Wireless Setting
<pre> $ sudo vim /etc/network/interfaces </pre>
```
iface wlan0 inet dhcp
  wpa-ssid " ssid name"
  wpa-psk " password"

$ sudo ifdown wlan0
$ sodo ifup wlan0
$ ifconfig
```
## Vim setting

<pre>$ vim ~/.vimrc</pre>

```bash
  syntax on                          ----------> 문법 기능 ON
  filetype indent plugin on            ----------> 확장자로 문서 형식 파악
  let python_version_2=1             ----------> python 2 문법을 따름(플러그 인)
  let python_highlight_all=1          ----------> 모든 강조(색상) ON(플러그 인)
  set tabstop=4                     ----------> 탭의 길이 설정
  set softtabstop=4                  ----------> 탭을 누를 때 실제로 벌어지는 간격
  set expandtab
  #set autoindent                      ----------> 자동 들여쓰기
  set bg=dark                       -----------> 배경을 어둡게(필수!) 가독성이 좋아짐
  set nu                             ----------> 라인 숫자 ON
```
+ vim file

http://www.vim.org/scripts/script.php?script_id=790
접속하여 자신에게 맞는 Python.vim 파일을 다운받아 ~/.vim/syntax/ 에 저장한다.
 
+ 자동완성기능

http://www.vim.org/scripts/script.php?script_id=850

1. 위 사이트로 가서 최신 pydiction-x.x.zip 다운
2. ~/.vim/ 폴더 안에 압축 해제
3. ~/.vim/after/ftplugin/ (해당 폴더가 없을 경우 만든다) python_pydiction.vim 파일이 들어 있어야한다.
4. ~/.vimrc 파일 수정
   => filetype plugin on 추가
   => let g:pydiction_location='~/.vim/pydiction(해당폴더명)/complete-dict' 추가
   
## Bashrc setting
<pre>alias ls='ls --color=auto --time-style=long-iso'</pre>
