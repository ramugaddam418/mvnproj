def call() {
bat "mvn -Dmaven.test.failure.ignore=true clean package"
}

