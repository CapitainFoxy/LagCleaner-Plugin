# LagCleaner

**LagCleaner** is a simple Minecraft plugin designed to help reduce server lag by automatically removing excess items from the game world at regular intervals. It also provides a warning to players before the cleanup occurs.

## Features

- Removes excess items from all worlds to reduce lag.
- Configurable cleanup interval.
- Configurable warning time before cleanup.
- Ability to enable or disable the plugin via configuration.

## Installation

1. **Clone** or **download** the repository.

2. **Build** the plugin using Maven:
    ```sh
    mvn clean package
    ```

3. **Download** the generated JAR file from the `target` directory.

4. **Place** the JAR file into your Minecraft server's `plugins` directory.

5. **Restart** your server to enable the plugin.

## Configuration

After installation, configure the plugin by editing the `config.yml` file located in the `plugins/LagCleaner` directory. The default configuration file looks like this:

```yaml
enabled: true
interval-minutes: 5
warning-seconds: 10

