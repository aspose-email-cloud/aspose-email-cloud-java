
package com.aspose.email.cloud.sdk.invoker;
import com.aspose.email.cloud.sdk.model.*;
import com.google.gson.GsonBuilder;
public class Derive {
    public static void registerAdapters(GsonBuilder builder)
    {
        builder.registerTypeAdapter(AiBcrImage.class, new TypeDeriveAdapter<AiBcrImage>());
        builder.registerTypeAdapter(AiNameParsedRequest.class, new TypeDeriveAdapter<AiNameParsedRequest>());
        builder.registerTypeAdapter(AttachmentBase.class, new TypeDeriveAdapter<AttachmentBase>());
        builder.registerTypeAdapter(ClientAccountBaseRequest.class, new TypeDeriveAdapter<ClientAccountBaseRequest>());
        builder.registerTypeAdapter(ContactPhoto.class, new TypeDeriveAdapter<ContactPhoto>());
        builder.registerTypeAdapter(DiscoverEmailConfigRequest.class, new TypeDeriveAdapter<DiscoverEmailConfigRequest>());
        builder.registerTypeAdapter(EmailClientAccountCredentials.class, new TypeDeriveAdapter<EmailClientAccountCredentials>());
        builder.registerTypeAdapter(ListResponseOfAiNameComponent.class, new TypeDeriveAdapter<ListResponseOfAiNameComponent>());
        builder.registerTypeAdapter(ListResponseOfAiNameExtracted.class, new TypeDeriveAdapter<ListResponseOfAiNameExtracted>());
        builder.registerTypeAdapter(ListResponseOfAiNameGenderHypothesis.class, new TypeDeriveAdapter<ListResponseOfAiNameGenderHypothesis>());
        builder.registerTypeAdapter(ListResponseOfContactDto.class, new TypeDeriveAdapter<ListResponseOfContactDto>());
        builder.registerTypeAdapter(ListResponseOfEmailAccountConfig.class, new TypeDeriveAdapter<ListResponseOfEmailAccountConfig>());
        builder.registerTypeAdapter(ListResponseOfEmailDto.class, new TypeDeriveAdapter<ListResponseOfEmailDto>());
        builder.registerTypeAdapter(ListResponseOfEmailThread.class, new TypeDeriveAdapter<ListResponseOfEmailThread>());
        builder.registerTypeAdapter(ListResponseOfMailMessageBase.class, new TypeDeriveAdapter<ListResponseOfMailMessageBase>());
        builder.registerTypeAdapter(ListResponseOfMailServerFolder.class, new TypeDeriveAdapter<ListResponseOfMailServerFolder>());
        builder.registerTypeAdapter(ListResponseOfStorageFileLocation.class, new TypeDeriveAdapter<ListResponseOfStorageFileLocation>());
        builder.registerTypeAdapter(ListResponseOfStorageModelOfCalendarDto.class, new TypeDeriveAdapter<ListResponseOfStorageModelOfCalendarDto>());
        builder.registerTypeAdapter(ListResponseOfStorageModelOfContactDto.class, new TypeDeriveAdapter<ListResponseOfStorageModelOfContactDto>());
        builder.registerTypeAdapter(ListResponseOfStorageModelOfEmailDto.class, new TypeDeriveAdapter<ListResponseOfStorageModelOfEmailDto>());
        builder.registerTypeAdapter(MailMessageBase.class, new TypeDeriveAdapter<MailMessageBase>());
        builder.registerTypeAdapter(MapiCalendarRecurrencePatternDto.class, new TypeDeriveAdapter<MapiCalendarRecurrencePatternDto>());
        builder.registerTypeAdapter(MapiMessageItemBaseDto.class, new TypeDeriveAdapter<MapiMessageItemBaseDto>());
        builder.registerTypeAdapter(MapiPropertyDescriptor.class, new TypeDeriveAdapter<MapiPropertyDescriptor>());
        builder.registerTypeAdapter(MapiPropertyDto.class, new TypeDeriveAdapter<MapiPropertyDto>());
        builder.registerTypeAdapter(RecurrencePatternDto.class, new TypeDeriveAdapter<RecurrencePatternDto>());
        builder.registerTypeAdapter(StorageFile.class, new TypeDeriveAdapter<StorageFile>());
        builder.registerTypeAdapter(StorageFolderLocation.class, new TypeDeriveAdapter<StorageFolderLocation>());
        builder.registerTypeAdapter(StorageModelOfCalendarDto.class, new TypeDeriveAdapter<StorageModelOfCalendarDto>());
        builder.registerTypeAdapter(StorageModelOfContactDto.class, new TypeDeriveAdapter<StorageModelOfContactDto>());
        builder.registerTypeAdapter(StorageModelOfEmailClientAccount.class, new TypeDeriveAdapter<StorageModelOfEmailClientAccount>());
        builder.registerTypeAdapter(StorageModelOfEmailClientMultiAccount.class, new TypeDeriveAdapter<StorageModelOfEmailClientMultiAccount>());
        builder.registerTypeAdapter(StorageModelOfEmailDto.class, new TypeDeriveAdapter<StorageModelOfEmailDto>());
        builder.registerTypeAdapter(StorageModelOfMapiCalendarDto.class, new TypeDeriveAdapter<StorageModelOfMapiCalendarDto>());
        builder.registerTypeAdapter(StorageModelOfMapiContactDto.class, new TypeDeriveAdapter<StorageModelOfMapiContactDto>());
        builder.registerTypeAdapter(StorageModelOfMapiMessageDto.class, new TypeDeriveAdapter<StorageModelOfMapiMessageDto>());

    }
}


    
