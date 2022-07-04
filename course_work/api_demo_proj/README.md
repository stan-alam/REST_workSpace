REST constraints:

• Client-server: Implement a clear separation between the server and the
client app with request/response interactions.
• Stateless systems: Make sure each request from the client contains all
that’s needed to complete that request. Don’t rely on any request context
information stored on the server.
• Cache: Make it possible for clients to know whether the server response
can be cached locally and replayed in the future.
• Uniform interface: Apply the generality of interface patterns between all
components.
– Identification of resources: Make each requestable resource have its
own unique identity (for example, an HTTP URL).
– Resource representations: Allow clients and servers to control the
representation of each request and response through message formats.
– Self-descriptive messages: Every request and response message should
contain all information needed to understand the message.
– Hypermedia to change application state: Changing the state of the
data stored on servers should be accomplished using links and forms
that completely describe the details of the interaction.
• Layered system: Each component should only be aware of the next component in the chain and not know about other layers of components in
the system.
• Code on demand: Client applications should be extensible through the
use of downloadable code-on-demand instead of having to build new client
applications for each new feature.
