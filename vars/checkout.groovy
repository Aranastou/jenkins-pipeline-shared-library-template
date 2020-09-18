#! /bin/groovy
def git_scm(urls,branch){
	node("master"){
		git branch: "${branch}", url: "${urls}"
	}
}

def mvn_build(){
	"sh -c mvn clean compile".execute()
}
