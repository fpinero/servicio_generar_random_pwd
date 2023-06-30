# Deploy app in kubernetes

* create namespace

````
kubectl create namespace random-passwd
````

* deploying app (ARM)

````
kubectl apply -f srvpwd-deployment.yaml -n random-passwd
````

* deploying app (AMD64)

```bazaar
kubectl apply -f srvpwd-amd64-deployment.yaml -n random-passwd
```

* deploy service

`````
kubectl apply -f srvpwd-service.yaml -n random-passwd
`````

* deploy ingress

````
kubectl apply -f srvpwd-ingress.yaml -n random-passwd
````

* test application

````
curl "http://orck3s.n0-reply.com/genpwd"
````
