#! /bin/groovy
def git_scm(urls,branch){
	node("master"){
		git branch: "${branch}", url: "${urls}"
	}
}

def mvn_build(args){
	node(){
		steps.sh "/bin/mvn clean ${args}"
	}
}
