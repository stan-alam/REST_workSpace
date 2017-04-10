# REST_workSpace
REST-RESTful workspace


# REST is a software Architectural Style that basically exploits the existing technology and protocols of the Web.

# RESTful is typically used to refer to web services implementing such an architecture.

# REST
  Representational state transfer is a style of software architecture for distributed hypermedia systems such as the WWW.
  As such, it is not strictly only a method of building what are sometimes called "web services."The terms "representational state transfer" and "REST" were introduced in 2000 in Roy Fielding's doctoral dissertation also one of the principal authors of HTTP specification.

  REST strictly refers to a collection of network architecture principles which outline how resources are defined and addressed. The term is often used in a looser sense to describe any simple interface which transmits domain-specific data over HTTP without an additional messaging layer such as SOAP or session tracking via cookies. These two meanings can conflict as well as overlap. It is possible to design any large software system in accordance with Fileding's REST architectural style without using HTTP and without interacting with the world wide web. It is also possible to design simple XML + HTTP interfaces which do no conform to REST principles, and instead follow a model of remote procedure calls. The difference between the uses of the term **"REST"** therefore causes **some confusion in technical discussions.**

# Systems which follow Fielding's REST principles are often referred to as "RESTful"

   Most introductions to REST start with the formal definition and background. The simplified pragmatic definition is a set of principles that define how Web standards, such as HTTP and URI's are supposed to be used ( which often differers quite a bit from what many people actually do). The promise is that if you adhere to REST principles while designing your application, you will end up with a system that exploits the Web's architecture to your benefit. In summary, the five key principles are:

# 1. Give everything an ID
# 2. Link things together
# 3. Use standard methods
# 4. Resources with multiple representations
# 5. Communicate in a stateless manner

-----------------------------------------------------------------------------------------------------------------------------

# RESTful:

   In REST, the software application architecture modeled after the way data is represented, accessed and modified on the web is an architecture in which data and functionality are considered resources, and these resources are accessed using URI's Uniform Resource Identifier, typically links on the web. The REST architecture **is fundamentally a client-server architecture:**, and is designed to use a stateless communication protocol, typically HTTP. In REST, clients and servers exchange representations of resources using a standardized interface and protocol. These principles encourage REST applications to be simple, lightweight, and have high performance.

# RESTful web services are web applications built upon the REST architecture.
   They:
   expose resource ( data and functionality ) through the web URIs
   use the four main HTTP methods - **CRUD** create, read, update and delete resources.
   RESTful web services typically map the four main HTTP methods to CRUD.

# GET : retrieve a resource
# POST: Create a resource
# PUT:  Update a resource
# DELETE: delete a resource



# Fundamentals of RESTful APIS

	* Performance: The communication style proposed by REST is meant to be efficient and simple,
	 allowing a performance boost on all systems that adopts it.

	* Scalability of Component interaction: Any distributed system should be able to handle this
	aspect well enough, and simple interaction proposed by REST greatly allows for this.

	* Simplicity of interface: A simple interface allows for simpler interaction between systems,
	which in turn can grant benefits as mentioned.

	* Modifiability of components: The distributed nature of the system, and the separation of
	concerns proposed by REST allows for components to be modified independently of each other
	at a minimum cost and risk.

	* Reliability: The stateless constraint proposed by REST allows for the easier recovery of
	a system failure.

	* Visibility: The stateless constraint proposed has the added full state of said requests:
	A component-centric design allows to make systems fault tolerant.


**REST is not suggested to use when you need to enforce a strict contract between client and server and when performing transactions that involve multiple calls**.

# What is REST?

REST: coined by Roy Fielding to describe a pattern for implementing networked systems.REST is an architectural style for designing distributed systems. It's not a standard, but rather a set of constraints. It's not tied to HTTP, but commonly associated with it.

**REST basics**

Unlike SOAP and XML-RPC, REST does not require a new message format. The HTTP API is CRUD, Create, Retrieve, DELETE.

		GET = "give me some info ( Retrieve ) "

		POST = "Here's some update info" ( Update ) "

		PUT = "Here's some new info ( CREATE ) "

		DELETE = "delete some info " (DELETE)

Oh wait... there's more!


		PATCH = " The HTTP method PATCH can be used to update
		partial resources, such as when you need to update one
		field of the resource, PUTing a complete representation
		might be cumbersome i.e. takes more bandwidth. "

		OPTIONS = "This method allows the client to determine the
		options and/or requirements associated with a resource, or
		the capabilities of a server, without implying a resource
		action or initiating a resource retrieval. "


# REST is a resource based architecture!

Each resource is identified by a URL. Every resource should support the HTTP common operations, and REST allows the
that resource to have different representations, e.g. text, xml, json..etc. The rest client can ask for specific representation via the HTTP protocol, i.e. Content-Negotiation.

**Resource** -- Conceptual target of a hypertext reference e.g. customer/order

**Resource Identifier** -- A uniform resource locater (URL) or uniform resource name (URN) identifiying a specific resource, e.g. zttp://restisthebest/consoles/nintendo/games/motor_city_patrol

**Representation** -- The resource content - JSON Message, HTML Document, JPEG image

**Representation Metadata** -- Information describing how to process the representation, e.g. media type, last-modified time

**Control Data** -- Information describing how to optimize response processing e.g. if-modified-since, cache-control-expiry


**Resources**

A REST resource to GET a list of nintendo games

zttp://restisthebest/consoles/nintendo/games

A REST resource to GET details of nintendo games
zttp://restisthebest/consoles/nintendo/games/blaster_master
#

##Representations

JSON representation of a response - GET in JSON

```javascript

{
   "Game":{
      "id":"1234",
      "name":"Super Mario Brothers 3"
   }
}


```
## Content Negotiation

HTTP natively supports a mechanism based on headers to tell the server about the content you expect and you're
able to handle. Based on these "hints", the server is responsible for returning the corresponding content in
the correct format.


	Client       --JSON format-> Server

	Only supports
	JSON format    <--406-------only supports XML format

Client sends a JSON request to the server, the server in this case can only accept XML format
THe server rejects the JSON payload and returns a 406 in the status code.
406 is not acceptable. According the accept headers send in the request.

Accept/Content-Type : JSON...etc



