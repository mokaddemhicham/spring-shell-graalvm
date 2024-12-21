# Spring Shell GraalVM

## Description
The Spring Shell GraalVM project is a command-line interface (CLI) application for managing tasks. It leverages Spring Shell to provide a set of commands for adding, listing, finding, marking as done, and deleting tasks. The project is built with JDK 21 and GraalVM, allowing for the creation of native executable images.

## Features
- Add new tasks with titles and descriptions.
- List all tasks.
- Find a task by its ID.
- Mark a task as done.
- Delete a task by its ID.
- Create native executable images using GraalVM for improved performance.

## Prerequisites
- [JDK 21](https://adoptopenjdk.net/)
- [GraalVM for JDK 21](https://www.graalvm.org/)

## Installation
To install and run the project, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/mokaddemhicham/spring-shell-graalvm.git
   cd spring-shell-graalvm
   ```

1. Set up JDK 21:
   Follow the instructions on the [AdoptOpenJDK website](https://adoptopenjdk.net/) to download and install JDK 21.

2. Set up GraalVM for JDK 21:
   Download GraalVM for JDK 21 from the [GraalVM website](https://www.graalvm.org/) and follow the installation instructions.

3. Build the project:
   ```bash
   ./mvnw clean package -DskipTests
   ```

4. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

## Creating an Executable File using GraalVM
To create a native executable file using GraalVM, follow these steps:

1. Build the native image:
   ```bash
   ./mvnw.cmd native:compile -Pnative -DskipTests
   ```

2. Run the native executable:
   ```bash
   ./target/shell
   ```

## Usage
After running the application, you can interact with the Spring Shell commands provided in the application. The available commands include:
- `hello` - Prints "Hello To Your Task Manager CLI"
- `add` - Adds a new task with a title and description
- `list` - Lists all tasks
- `find` - Finds a task by its ID
- `done` - Marks a task as done
- `delete` - Deletes a task by its ID

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.

## Creator
- **Hicham Mokaddem**
- GitHub: [mokaddemhicham](https://github.com/mokaddemhicham)
- Email: [contact@mokaddemhicham.ma](contact@mokaddemhicham.ma)
- Date: 2024-12-21