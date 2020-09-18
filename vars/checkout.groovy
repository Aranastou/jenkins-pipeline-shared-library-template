#! /bin/groovy
def git_scm(urls,branch){
	node("master"){
		git branch: "${branch}", url: "${urls}"
	}
}

def mvn_build(){
	steps{
		maven("-c clean compile")
	}
}
