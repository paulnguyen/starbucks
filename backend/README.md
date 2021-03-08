# Starbucks End-to-End Example


## REST API 

Run the provided Starbucks API (written in Go).  See Demo in class on how to setup, build and run a Go Application.  Then test the Starbucks API, use the provided Insomnia Project.

![insomnia-project](images/insomnia-project.png)

The API Specification is as follows. 

The Starbucks API Specification is as follows:

```
GET 	/ping
		Ping Health Check.

GET 	/cards 
		Get a list of Starbucks Cards (along with balances).

		[
		  {
		    "CardNumber": "498498082",
		    "CardCode": "425",
		    "Balance": 20.00
		  },
		  {
		    "CardNumber": "627131848",
		    "CardCode": "547",
		    "Balance": 20.00
		  }
		]		

POST 	/cards
		Create a new Starbucks Card.

		{
		  "CardNumber": "627131848",
		  "CardCode": "547",
		  "Balance": 20.00
		}

GET 	/cards/{num}
		Get the details of a specific Starbucks Card.

		{
		  "CardNumber": "627131848",
		  "CardCode": "547",
		  "Balance": 20.00
		}		

GET 	/card/{num}/{code}
		Validate Card 

		{
		  "CardNumber": "627131848",
		  "CardCode": "547",
		  "Balance": 20.00
		}	

POST    /order/register/{regid}
        Create a new order. Set order as "active" for register.

	    {
	      "Drink": "Latte",
	      "Milk":  "Whole",
	      "Size":  "Grande"
	    }         

GET     /order/register/{regid}
        Request the current state of the "active" Order.

DELETE  /order/register/{regid}
        Clear the "active" Order.

POST    /order/register/{regid}/pay/{cardnum}
        Process payment for the "active" Order. 

GET     /orders
        Get a list of all active orders (for all registers)

DELETE 	/cards
		Delete all Cards (Use for Unit Testing Teardown)

DELETE 	/orders
		Delete all Orders (Use for Unit Testing Teardown)
```

## Explore the Sample Node.js and Java Mobile App Simulator

Run these Apps against the Starbucks Go API and explore how they work.


### Example Workflow

1. Run Starbucks API (Compile and run in Go)

* Launch via Docker Image:  paulnguyen/starbucks-api:v1.0

```
	docker network create --driver bridge starbucks
	docker run --network starbucks --name starbucks-api -p 3000:3000 -td paulnguyen/starbucks-api:v1.0
```

2. Starbucks App (Mobile App Simulator)

* Requires Gradle 4.9 and Java JDK 8
* Launch and Login with PIN: 1234 

![1-starbucks-app](images/1-starbucks-app.png)

3. Placing an Order on the Starbucks Cash Register (Node.js App)

* Run via Docker Image: paulnguyen/starbucks-nodejs:v1.0

```
docker run --network starbucks --name starbucks-nodejs -p 8080:8080  -e "api_endpoint=http://starbucks-api:3000" -td paulnguyen/starbucks-nodejs:v1.0
```

4. Paying on the Starbucks App

![4-starbucks-app-pay](images/4-starbucks-app-pay.png)

5. See Balance on Starbucks Card after Payment

![5-starbucks-app-paid-balance](images/5-starbucks-app-paid-balance.png)

6. Check Starbucks Cash Register for Successful Payment (Node.js App)

![6-starbucks-register-paid-for-order](images/6-starbucks-register-paid-for-order.png)

7. Sample REST API Calls from Insomnia (List Cards)

![7-rest-api-cardsp](images/7-rest-api-cards.png)

8. Sample REST API Calls from Insomnia (List Orders)

![8-rest-api-orders](images/8-rest-api-orders.png)



# Reference

* http://unirest.io/java.html 
* https://www.baeldung.com/unirest
* http://stleary.github.io/JSON-java/index.html
* https://www.programcreek.com/java-api-examples/?api=com.mashape.unirest.http.Unirest







