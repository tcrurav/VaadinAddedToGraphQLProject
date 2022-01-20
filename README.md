# Adding Vaadin to a previous project with GraphQL

This is an exaple made to demonstrate how to add Vaadin to a previous project with GraphQL.

In this case the previous project has been this one:
https://github.com/tcrurav/SpringGraphQL

## Getting Started

Clone this project:

```
$ git clone https://github.com/tcrurav/VaadinAddedToGraphQLProject.git
```

Open your Eclipse IDE and run this project as Spring boot App. If you don't know how, watch the following steps of this video: https://www.youtube.com/watch?v=DvzGf0cAlg4
* Install last JDK LTS.
* Install Eclipse IDE for Java EE Developers.
* Configure your Eclipse IDE with your JDK.
* Install STS (Spring Tool Suite from Pivotal Company).
* Install MySQL Workbench.
* Import the db_bicycles_gql.sql file of this project in your MySQL Server.
* Configure your connection to MySQL editing user/password in the file application.properties of this project.

Once you have followed all the steps above, run the project as Spring Boot App.

If everything went well you can now check that both GraphQL and Vaadin work:

Query to show all bicycles:

![alt text](https://github.com/tcrurav/SpringGraphQL/blob/master/screenshots/screenshot-query.png)

Vaadin working:

![alt text](https://github.com/tcrurav/SpringGraphQL/blob/master/screenshots/screenshot-vaadin-working.png)


## How to proceed to add Vaadin to a previous project

You can always add Vaadin or any other dependency to your project after having created it by right clicking on your pom.xml -> Spring --> Add Starters:

![alt text](https://github.com/tcrurav/SpringGraphQL/blob/master/screenshots/screenshot-adding-to-pom.png)

After that just follow the usual procedure to add any new dependency. In this case: Vaadin

![alt text](https://github.com/tcrurav/SpringGraphQL/blob/master/screenshots/screenshot-adding-to-pom-2.png)

And then you can happily start coding. It's always interesting to organize your code with packages. In this case I have added the package com.tiburcio.bicyclesWithGraphQL.vaadin.

![alt text](https://github.com/tcrurav/SpringGraphQL/blob/master/screenshots/screenshot-vaadin-code.png)


## Prerequisites

You need a working environment with:
* [Git](https://git-scm.com) - You can install it from https://git-scm.com/downloads.
* [MySQL](https://www.mysql.com) - You can install it from https://www.mysql.com/downloads/.
* [MySQL Workbench](https://www.mysql.com/products/workbench/) - You can install it from https://dev.mysql.com/downloads/workbench/.
* [Eclipse IDE](https://www.eclipse.org/) - Install it if you want to edit this project backend with Eclipse IDE.
* [Spring Tools Suite](https://spring.io/tools) - Install the plugin in Eclipse IDE.


## General Eclipse IDE Installation instructions for a Spring Boot Project

Follow this video tutorial: https://www.youtube.com/watch?v=DvzGf0cAlg4

## Built With

* [Eclipse IDE](https://www.eclipse.org/) - Install it if you want to edit this project backend with Eclipse IDE.
* [Spring Tools Suite](https://spring.io/tools) - Install the plugin in Eclipse IDE.
* [Node.js](https://nodejs.org/) - Node.js® is a JavaScript runtime built on Chrome's V8 JavaScript engine.
* [MySQL Workbench](https://www.mysql.com/products/workbench/) - MySQL Workbench is a unified visual tool for database architects, developers, and DBAs.
* [Vaadin](https://vaadin.com/) - Vaadin is a web app development platform for Java. It helps you build reliable web apps with great UX faster than before.
* [GraphQL](https://graphql.org/) - GraphQL is a query language for APIs and a runtime for fulfilling those queries with your existing data. GraphQL provides a complete and understandable description of the data in your API, gives clients the power to ask for exactly what they need and nothing more, makes it easier to evolve APIs over time, and enables powerful developer tools.
* [GraphiQL](https://github.com/graphql/graphiql) - A tool that helps you structure GraphQL queries correctly.


## Acknowledgments

* https://vaadin.com/docs/v14/flow/guide/quick-start. Official Vaadin "Get Started" link.
* https://www.howtographql.com/. The Fullstack Tutorial for GraphQL.
* https://dzone.com/articles/a-beginners-guide-to-graphql-with-spring-boot. Excellent tutorial as a basis to create a Spring boot project accessible through GraphQL.
* https://www.baeldung.com/spring-graphql. Getting Started with GraphQL using Spring.