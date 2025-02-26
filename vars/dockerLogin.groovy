// to run this command you need to create credentials in jenkins 
def call(string credential){
withCredentials([usernamePassword(credentialsId: credential,
passwordVariable: 'dockerHubPass', userVariable: 'dockerHubUser')]){
sh 'docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}'
sh 'docker tag notes-app:latest ${env.dockerHubUser}/notes-app:latest'
sh 'docker push ${env.dockerHubUser}/notes-app:latest'
}
