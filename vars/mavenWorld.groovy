def call() {
#sh "mvn -Dmaven.test.failure.ignore=true clean package"
sh 'mvn clean package'
}

