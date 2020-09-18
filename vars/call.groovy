#! /bin/groovy
def git_scm(urls,branch){
	node("master"){
		git branch: "${branch}", url: "${urls}"
	}
}

def mvn_build(args){
	node(){
		steps.sh "mvn clean ${args}"
	}
}
