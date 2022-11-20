# Nginx ←→ php-fpm ←→ MySQL

## 概要
Nginx, PHP-fpm, MySQLの連携をしたDocker-compose

PHPにはLaravelを使用。

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

##### Laravelトップ画面
```
http://localhost:8080
```

##### 開発ナレッジ
* Laravelでcreate-projectしたい
  * /backoffice以下を削除して、phpコンテナーから以下のコマンドを実行。
  ```sh
  [] cd /var/www/html
  [] composer create-project laravel/laravel=8 --prefer-dist backoffice
  ```

* Laravelのenvが反映されない
  * キャッシュクリア
  ```sh
  php artisan cache:clear
  ```

* Laravelの画面を開こうとしたらPermission deniedって出る
  * 暫定措置
  ```sh
  chown -R www-data:www-data /var/www/html/storage
  ```
