# Rewards
## Customer Rewarding Application 

```
## API - http://{host}/rewards/rewards/get-reward-points?price=120
Request Method: GET
Request Parameter: price
Sample valid Response: 
{
    "id": 1,
    "price": 120,
    "rewardPoints": 90
} 
Sample invalid response: 
{
    "message": "Invalid price ",
    "timestamp": "2023-01-31T00:23:33.9446781"
}
```

# Health Check 

```
http://localhost:8080/actuator/health
```
