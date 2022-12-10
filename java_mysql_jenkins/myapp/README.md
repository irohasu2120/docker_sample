# MyApp

## Intellij
### コンソール文字化け対策
コンソールの日本語が文字化けしている場合、以下の設定を追記する。
```
[ヘルプ]-[カスタムVMオプションの編集]
-Dfile.encoding=UTF-8
```

## Swagger
### Swagger-UI
http://{Domain}/swagger-ui.html

### Flyway

* DBを最新化したい
```shell
gradle flywayMigrate
```

* DBを全削除したい
```shell
gradle flywayClean
```
