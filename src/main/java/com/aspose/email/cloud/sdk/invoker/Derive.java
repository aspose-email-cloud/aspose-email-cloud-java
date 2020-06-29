package com.aspose.email.cloud.sdk.invoker;
import com.aspose.email.cloud.sdk.model.*;
import com.google.gson.GsonBuilder;
public class Derive {
    public static void registerAdapters(GsonBuilder builder)
    {
        builder.registerTypeAdapter(AccountBaseRequest.class, new TypeDeriveAdapter<AccountBaseRequest>());
        builder.registerTypeAdapter(AiBcrImage.class, new TypeDeriveAdapter<AiBcrImage>());
        builder.registerTypeAdapter(AiBcrRq.class, new TypeDeriveAdapter<AiBcrRq>());
        builder.registerTypeAdapter(AiNameParsedRq.class, new TypeDeriveAdapter<AiNameParsedRq>());
        builder.registerTypeAdapter(AttachmentBase.class, new TypeDeriveAdapter<AttachmentBase>());
        builder.registerTypeAdapter(ContactPhoto.class, new TypeDeriveAdapter<ContactPhoto>());
        builder.registerTypeAdapter(DiscoverEmailConfigRq.class, new TypeDeriveAdapter<DiscoverEmailConfigRq>());
        builder.registerTypeAdapter(EmailAccountRequest.class, new TypeDeriveAdapter<EmailAccountRequest>());
        builder.registerTypeAdapter(EmailClientAccountCredentials.class, new TypeDeriveAdapter<EmailClientAccountCredentials>());
        builder.registerTypeAdapter(ListResponseOfEmailAccountConfig.class, new TypeDeriveAdapter<ListResponseOfEmailAccountConfig>());
        builder.registerTypeAdapter(ListResponseOfEmailThread.class, new TypeDeriveAdapter<ListResponseOfEmailThread>());
        builder.registerTypeAdapter(ListResponseOfStorageModelOfCalendarDto.class, new TypeDeriveAdapter<ListResponseOfStorageModelOfCalendarDto>());
        builder.registerTypeAdapter(ListResponseOfStorageModelOfContactDto.class, new TypeDeriveAdapter<ListResponseOfStorageModelOfContactDto>());
        builder.registerTypeAdapter(ListResponseOfStorageModelOfEmailDto.class, new TypeDeriveAdapter<ListResponseOfStorageModelOfEmailDto>());
        builder.registerTypeAdapter(MapiCalendarRecurrencePatternDto.class, new TypeDeriveAdapter<MapiCalendarRecurrencePatternDto>());
        builder.registerTypeAdapter(MapiMessageItemBaseDto.class, new TypeDeriveAdapter<MapiMessageItemBaseDto>());
        builder.registerTypeAdapter(MapiPropertyDescriptor.class, new TypeDeriveAdapter<MapiPropertyDescriptor>());
        builder.registerTypeAdapter(MapiPropertyDto.class, new TypeDeriveAdapter<MapiPropertyDto>());
        builder.registerTypeAdapter(RecurrencePatternDto.class, new TypeDeriveAdapter<RecurrencePatternDto>());
        builder.registerTypeAdapter(StorageFile.class, new TypeDeriveAdapter<StorageFile>());
        builder.registerTypeAdapter(StorageFolderLocation.class, new TypeDeriveAdapter<StorageFolderLocation>());
        builder.registerTypeAdapter(MapiPidPropertyDescriptor.class, new TypeDeriveAdapter<MapiPidPropertyDescriptor>());
    }
}
