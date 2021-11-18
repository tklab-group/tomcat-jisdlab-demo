# tomcat-demo
[JISDLab](https://github.com/tklab-group/JISDLab)の評価に使用したTomcat環境(Windows10)
## 環境構築手順
1. このリポジトリをcloneする
1. apache-tomcat-9.0.41の絶対パスを環境変数`CATALINA_HOME`に設定する
1. `gradlew.bat`を起動する
1. `gradle war`コマンドを実行する
1. apache-tomcat-9.0.41/webappsにTomcatDemo-0.0.2.warが作成されていれば成功

※ warが作成できない場合は研究室の共有スペース(/peperoncino/share/sugiyama)を参照してください

## 実験手順
1. https://github.com/tklab-group/JISDLab のeasy-setup.mdにある「Dockerを使わない場合」を参照してWindows用にJISDLab環境を構築する
1. JISDLabディレクトリで`jupyter lab`を実行する
1. PowerShell上で以下を実行する
   - Case1(JPDAによるデバッグ)
   ```sh
   $env:JPDA_ADDRESS="localhost:25432"; cmd.exe /c %CATALINA_HOME%/bin/catalina.bat jpda start
   ```
1. cases.ipynbにJupyterクライアント(ブラウザ, IDE etc.)からアクセスしてCase1を順次実行する
1. Case1の実行が終了したらいったんTomcatサーバーを終了する
1. PowerShell上で以下を実行する
   - Case2(ProbeJによるデバッグ)
   ```sh
   $env:PROBEJ_PORT=39876; cmd.exe /c %CATALINA_HOME%/bin/catalina.bat probej start
   ```
1. 引き続き，cases.ipynbのCase2を順次実行する．
