# Selenium学习经验/Experience of Selenium

### 在Docker中部署时安装chrome浏览器/How to install chrome in Docker
1. 使用root身份进入Container/Login the container with root  
```bash
docker exec -it --user root 8dede85d3132 /bin/bash
```
2. 使用uname检查操作系统的架构。如果是x86_64则可以安装chrome浏览器，如果是aarch64则需要安装chromium。/ Check OS arch using uname. If the result is aarch64, you need to install chromium. 
```bash
uname -m
```
3. 安装Chromium, ChromeDriver及xvfb/Install chromium，ChromeDriver and xvfb.   
```bash
apt-get install -y chromium chromium-driver xvfb --no-install-recommends
```
4. 在代码中加入/Code for the test case
```Java
ChromeOptions options = new ChromeOptions();
options.addArguments("--headless=new");
options.addArguments("--no-sandbox");
options.addArguments("--disable-dev-shm-usage");
WebDriver driver = new ChromeDriver(options);
```