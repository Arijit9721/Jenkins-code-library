// function to clone a github repo
def call(String url,String branch){
    git url: "${url}", branch: "${branch}"
}
