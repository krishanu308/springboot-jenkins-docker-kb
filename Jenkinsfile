pipeline {
	agent any
	environment{
		DOCKER_TAG = getDockerTag()
	}
		stages{
			stage('Build Dcoker Image'){
				steps{
					bat "docker build . -t krishanu/springboot-jenkins-docker-kb:${DOCKER_TAG}"	
				}
			}
		}
}

def getDockerTag(){
 	def tag = bat('git rev-parse HEAD', returnStdout: true)
 	return tag
 }