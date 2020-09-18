#! /bin/groovy
def git_scm(urls,branch){
	node("master"){
		git branch: "${branch}", url: "${urls}"
	}
}

def mvn_build(args){
	steps.sh "${steps.tool 'Maven'}/bin/mvn clean compile ${args}"
}
