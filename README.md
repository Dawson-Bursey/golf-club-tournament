To run in docker first compse docker up
then in postman compy the following tests:
http://localhost:8080/api/members 
  {
  "firstName": "Dawson",
  "lastName": "Bursey",
  "address": "123 Golf St",
  "email": "DawsonBursey@gmail.com",
  "phoneNumber": "1234567890",
}

http://localhost:8080/api/members

http://localhost:8080/api/tournaments
{
  "name": "Summer Classic",
  "startDate": "2024-07-15",
  "endDate": "2024-07-20",
  "location": "Palm Beach Golf Club",
  "cashPrizeAmount": 50000,
  "entryFee": 250
}

http://localhost:8080/api/tournaments

http://localhost:8080/api/members/searchMembers?firstName=Dawson
