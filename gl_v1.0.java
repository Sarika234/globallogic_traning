1. Java 
2 . Java Hello WOrld

//installation of java
//installation of eclipse

Open the Eclipse
#Choose the workspace or create new workspace
#workspace--it is working directory for java application
#create a java Application 
             --File--> New--> Other Project
			 
			 --Type Java Application in search bar
			 
			 --Select the Java Project
			 
You have to give the Application Properties	
#Name --After giving the project name click on next
       --Again Click on next screen
	   --Create Modules Info. DO not create this one
	   
	   
	   
	   
		 
			 
>java application
            Folder Structure of Java Application
                 ---Src
				     --Need to Create the Package 
#Java Package--it is like a folder or directory in oS
             --it is used to store the related file of one project
> You are creating and maintaining the project
> blong to some company and there will project also

     Package--> #it start with company name domain 
	         com
			#give the company name
			 --globallogic
			 #give the project and topic name
			 --helloworld
			 #it always have lower care
			 com.globallogic.demo
			 #it will not have any keyword
			 

#keyword --these are reserved word in the java 
         -- cannot use it for your own purpose			 
	
	
#JavaClass --it will be package name

//String 
//Class and Object
		   
		   
#Friends
   >System
        --variable
		--Out(PrintStream)
		--Method
   >PrintStream
          --print
		  --println()
		  
   >Scanner Class 
          //method   
          --nextInt()
          --nextShort()
          --nextBoolean()
          --next()
          --nextLine();

     >Byte	  
     
 
#Keywords 
        --extends : it is use to extends the funcalatiy of one class to another
        --final keyword--
        --Static Keyword
		
		
Jre

Work with JDK
You have to change the jre to JDK

Already taken the project follow these steps:
right click on the project
>go to build path
>Go to Libraries 
>Select the JRE system and click on remove
>Select the Modules Path and add the Libraray
>Select the JRE system Libraray
>Click on Install JRes
>Select the installed JRe Libraray
>Click on remove to delete this Libraray
>Click on Add to add the new Libraray
>Click on next and select the path of installed java 

#JDk installed in system
#JDK config in the eclipse


#Reading the Data and Wrtiing the Data on memory
   >each language has the features to add and remove the data to menory
   >variable in all the language 
   >becuase you have have different value in same memory place

#DataType
#Identifer
#Operator
#Heap Memory
#Stack Memory

OOPS concept---object oritneted programining language 
in most of the language

//object oritneted Application
class and object
inheritance(completed)
encapsulation (completed)
polymorphism(completed)
Abstraction(completed)
        //it is concept that does not have any implementation
		//cell phone(it is idea or concept)
		//implementation class
		//two ways of absraction:
		//interface 
		//abstract class
		
		#callphone--calling
		         #--send sms
         #must have the implemented class
    


#class and Object ,method
#Inheritance -- reuse usabality of code 
         --two class will have parent child relatiosnhip
		 --base class and child
		 --you can use the extends keyword
             -- we have two classes these two class will have class A
			          //varibale
					  //method
			        --printA()
			      Class B
				  //printB();

//Ravinder 
				  
calculator
{
Addition
Subtraction
Multipcation
Divide
}	

//interst also
//Kumar

Class SuperCalculator extends Calcualtor
{
	
	
}
    (super) 
//basic data type : int , float ,double. char
//Wrapper--: becuase it has encapsulated the already existed class like int , float or double
//in java we have requirement to convert basic data type to object or class
create the method of wrapper
Byte --byte
Short --short
Long --long
Integer --int
Character-->char
Boolean ---boolean


Build Tools: these are tools which help to build the project and fetch the depenedancy at a time.
            : java project -> jar
            : web app  ---> jar -> war
            : compile the code and generate the required output 

       1. Install the MAVEN
	   2. Confiure the MAVEN tools in window
	   3. You have to take a maven project 
	   4  add the dependancy in the pom.xml
	   5 run mavan command to use it.
	   
	Maven Web  Application
	
Structure of Mavan Project :
           >Maven Dependencies 
           > Src
                >Main
                    > package 
                        >class
           >pom.xml
		   
		   
HTTP CLinet :it help us to send and take the response back
Post : it can be installed in window and you can send post put get and delete request to API'same
Swagger : it is third part tools . But you can integrate the web application into api  		   
	
Swagger 2 and Swagger 3 is there 


//Step 1: 


       <dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-boot-starter</artifactId>
			<version>3.0.0</version>
		</dependency>	   


Step 2://Create a config class 

/////////////////////////////////////////////////

package com.globallogic.demojpa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig implements WebMvcConfigurer{                                    
	@Bean
	public Docket api() {
	 return new Docket(DocumentationType.SWAGGER_2)
	 .select()
	 .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
	 .paths(PathSelectors.any())
	 .build();
	}

	
	public static ApiInfo metadata(){
		 return new ApiInfoBuilder()
		 .title("Project Titlw")
		 .description("Created By Ravinder Kumar")
		 .version("1.x")
		 .build();
		}
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");    
   }
}

//Step: change the Properties files to have matching strategy

	   spring.mvc.pathmatch.matching-strategy=ant-path-matcher 

//Step 4: Swagger URL for Application

http://localhost:8888/swagger-ui/index.html


#Spring Security: it is part of spring freamwork and it provide the two things 

#Spring authentication : you have valid login credtenial to enter into some system  
                     # : username
					#  : password
# it will verify the user who have the registered account. and password matched then user is able to login 					  

Spring authorization : right of access: 
                      : admin--able to add the courses and marks of student
					   : student : view the result
					   :staff : able to add exam and result 
					    :controller level

#USer login details with Roles
#user : ravinder
#password : kumar
#role : admin						
						
Auth Token : Jwt : json web Token
             Auth2.0 : 


College managment System : 


Spring Security is a Java/Java EE framework that provides authentication, authorization and other
































 			
			
	Registration Number*		CH01BR0191
Chassis No (Full)       ME4JF495AJ8164745
 Engine No*              JF49E82279474



   
            	