# Airbnb Clone Backend

This repository contains the backend service for the Airbnb Clone application. It is built with **Spring Boot**, utilizing **MVC concepts** within a **monolithic architecture**.

## Prerequisites

* **Docker & Docker Compose:** You need Docker installed and running on your system to use the quick setup method via Docker Compose. You can download it from [Docker's Official Website](https://www.docker.com/products/docker-desktop/).

## Quick Setup (Using Docker Compose)

This guide helps you get the backend server running quickly using Docker Compose.

**⚠️ Important Note:** The `docker-compose.yml` file included in this repository might be slightly outdated due to recent API endpoint changes and may require adjustments. It will be updated soon to reflect the latest configurations.

1.  **Navigate to Project Root:**
    Open your terminal or command prompt and navigate to the root directory of this project where the `docker-compose.yml` file is located.

2.  **Ensure Docker is Running:**
    Verify that your Docker engine/daemon is running in the background.

3.  **Start the Services:**
    Execute the following command. This will build the Docker image (if it doesn't exist locally) and start the application container(s).
    ```bash
    docker-compose up
    ```
    
    *Tip: To run the containers in the background (detached mode), use `docker-compose up -d`.*

4.  **Stopping the Server:**
    * If you ran `docker-compose up` directly in your terminal, press `Ctrl+C` in that same terminal window.
    * If you ran in detached mode (`-d`), use the following command in the project root directory:
        ```bash
        docker-compose down
        ```

## API Documentation (Swagger UI)

Once the backend server is running (typically on port 8080 via Docker Compose), you can access the interactive API documentation powered by Swagger UI:

* **Swagger UI URL:** [http://localhost:8080/api/v1/swagger-ui/index.html#/](http://localhost:8080/api/v1/swagger-ui/index.html#/)

    *(Note: The port might differ if you have modified the `docker-compose.yml` or run the application outside of Docker.)*

## API Endpoint Samples (Screenshots)

Here are some example screenshots from the Swagger UI showing the available API endpoints:

* **Example 1:**
    ![Swagger UI Sample 1](./public/swagger-ui-1.png "API Sample 1")

* **Example 2:**
    ![Swagger UI Sample 2](./public/swagger-ui-2.png "API Sample 2")
* **Example 3:**
    ![Swagger UI Sample 2](./public/swagger-ui-3.png "API Sample 2")
* **Example 4:**
    ![Swagger UI Sample 2](./public/swagger-ui-4.png "API Sample 2")
* **Example 5:**
    ![Swagger UI Sample 2](./public/swagger-ui-5.png "API Sample 2")
