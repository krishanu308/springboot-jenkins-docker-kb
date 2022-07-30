# springboot-jenkins-docker-kb
Demo project for springboot docker kubernetes and jenkins job

Steps of deploying
1. Create your spring boot application
2. Create the docker file in the application
3. Build your poject using maven so that jar gets created in target folder of your application
4. Open cmd promt and check the minikube status if not started, execute minikube started
5. Go to the directory of your project and Execute docker build -t springboot-jenkins-docker-kb:1.0 -f Dockerfile .
6. Execute :  minikube docker-env | Invoke-Expression
7. Execute : docker images
8. Create Deployment yml file in your project and then execute it:  kubectl apply -f hello-deploy.yml
9. Check using command : kubectl get all / kubectl get deployments / kubectl get pods
10. Create service yml in your project: kubectl apply -f hello-service-deploy.yml
11. Check status using command: kubectl get svc
12. To check the nordport and ip: kubectl get nodes -o wide
13. Check to see all the configuration for nodeport: kubectl describe service <service-name>
14. You wont be able to access using the nodeport ip and nodeport, so you have to use port-forward command.
15. Execute the command: kubectl port-forward deployment/<deployment name> 2311:<portname added in service file.yml>
Example: kubectl port-forward deployment/springboot-jen-dock-k8s 2311:8080
