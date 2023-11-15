def call() {
sh "mvn -Dmaven.test.failure.ignore=true clean package"
}

