# Deploy app in kubernetes

* create namespace

````
kubectl create namespace random-passwd
````

* deploying app

````
kubectl apply -f srvpwd-deployment.yaml -n random-passwd
````

* deploy service

`````
kubectl apply -f srvpwd-service.yaml -n random-passwd
`````

* deploy ingress

````
kubectl apply -f srvpwd-ingress.yaml -n random-passwd
````
