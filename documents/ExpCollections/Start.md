# 在Docker中部署时安装chrome浏览器
1. 使用root身份进入Container
2. 使用uname检查操作系统的架构。如果是x86_64则可以安装chrome浏览器，如果是aarch64则需要安装chromium
3. 安装chrome及driver
'''chromium-driver \
   xvfb'''
4. 