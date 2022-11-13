# Nginx ←→ php-fpm ←→ MySQL

## 概要
Nginx, PHP-fpm, MySQLの連携をしたDocker-compose

### コマンド
#### 起動
```sh
docker-compose up -d
```

##### 停止
```sh
docker-compose down
```

##### コンテナーに入る
```sh
docker-compose exec {コンテナ名} sh
```

##### Larabelトップ画面
```
http://localhost:8080
```

##### 開発ナレッジ
* Larabelでcreate-projectしたい
  * /app以下を削除して、phpコンテナーから以下のコマンドを実行。
  ```sh
  [] cd /var/www/html
  [] composer create-project --prefer-dist "laravel/laravel=9.3.10" .
  ```

* Larabelの画面を開こうとしたらPermission deniedって出る
  * 暫定措置
  ```sh
  chown -R www-data:www-data /var/www/html/storage
  ```
