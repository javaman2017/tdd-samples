package Messenger;

import Messenger.interfaces.*;

public class MessengerImpl implements Messenger {
    private MailServer mailServer;
    private TemplateEngine templateEngine;

    public MessengerImpl(MailServer mailServer, TemplateEngine templateEngine) {
        this.mailServer = mailServer;
        this.templateEngine = templateEngine;
    }

    public void sendMessage(Client client, Template template) {
        String msgContent = templateEngine.prepareMessage(template,client);
        mailServer.send(client.getEmail(),msgContent);
    }
}
