## Symphony Elements Templating Bot Example
This example project demonstrates the ability to use the templating engines FreeMarker and Handlebars to structure message payloads.
Please refer to the [complete guide](https://developers.symphony.com/symphony-developer/docs/templating-engines) at the Symphony developer documentation site for an explanation of templating engines.

### Requirements
* JDK 8+
* Maven 3
* Symphony Pod 1.55.3 or later
* Symphony API Agent 2.55.9 or later

### Configuration
Fill up `src/main/resources/config.json` with the appropriate values for pod information,
and service account details 
```json5
{
    "sessionAuthHost": "[pod].symphony.com",
    "sessionAuthPort": 443,
    "keyAuthHost": "[pod].symphony.com",
    "keyAuthPort": 443,
    "podHost": "[pod].symphony.com",
    "podPort": 443,
    "agentHost": "[pod].symphony.com",
    "agentPort": 443,
    "botUsername": "bot-username",
    "botEmailAddress": "bot-username@company.com",
    "botPrivateKeyPath": "rsa/",
    "botPrivateKeyName": "rsa-private.pem"
}
