# LagCleaner

**LagCleaner** is a simple Minecraft plugin designed to help reduce server lag by automatically removing excess items from the game world at regular intervals. It also provides a warning to players before the cleanup occurs.

## Features

- Removes excess items from all worlds to reduce lag.
- Configurable cleanup interval.
- Configurable warning time before cleanup.
- Ability to enable or disable the plugin via configuration.

## Installation

1. **Download** the latest release of the plugin JAR file.
2. **Place** the JAR file into your Minecraft server's `plugins` directory.
3. **Restart** your server to enable the plugin.

## Configuration

After installation, you can configure the plugin by editing the `config.yml` file located in the `plugins/LagCleaner` directory. The default configuration file looks like this:

```yaml
enabled: true
interval-minutes: 5
warning-seconds: 10
