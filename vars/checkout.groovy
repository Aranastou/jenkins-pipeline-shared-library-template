#! /bin/groovy
def git_scm(urls,branch){
	node("master"){
		git branch: "${branch}", url: "${urls}"
	}
}

def mvn_build(){
	stage('build'){
		steps{
			sh 'mvn clean compile'
		}
	}



}
