def call(String project, String imageTag) {
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred',
                                    passwordVariable: 'dockerHubPass',
                                    usernameVariable: 'dockerHubUser')]) {
      sh "echo ${dockerHubPass} | docker login -u ${dockerHubUser} --password-stdin"
      sh "docker push ${dockerHubUser}/${project}:${imageTag}"
  }
}
