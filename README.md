# Movie

This project was generated with JAVA 8 and Spring boot 2.1.0.RELEASE

## Development server

Run Spring boot for a dev server. Navigate to `http://localhost:8006/`. 

## REST End points

# Add movie details 

EndPoint : /v1/movie
Method: POST
Sample Request: 
	{
  "movieName": "ererer",
  "year": 2018,
  "ratings": 3.5,
  "rated": "G"
	}
	
# Get Movie Details
EndPoint : /v1/movie
Method: GET
Response: 
	[{
  "movieName": "ererer",
  "year": 2018,
  "ratings": 3.5,
  "rated": "G"
	}]
	
#Delete a Movie
EndPoint : /v1/movie/id/{id}
Method: DELETE