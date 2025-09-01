def call(String Imagename,String ImageTag,String DockerHubUSer){
echo "This is building the code"
sh "docker build -t ${DockerHubUSer}/${Imagename}:${ImageTag} ."
}
