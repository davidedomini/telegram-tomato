import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.command
import com.github.kotlintelegrambot.dispatcher.text
import com.github.kotlintelegrambot.logging.LogLevel

fun main(args: Array<String>) {
    val bot = bot {
        token = "<Your Token>"
        timeout = 60
        logLevel = LogLevel.Network.Body

        dispatch {
            command("<Your Command>") {
                TODO("Add here what the bot should do")
            }

            text("<Text>") {
                TODO("Add here what the bot should do")
            }
        }
    }
    bot.startPolling()
}
