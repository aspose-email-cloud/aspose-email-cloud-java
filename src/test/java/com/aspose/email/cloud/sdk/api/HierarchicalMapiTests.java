package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.api.utils.TestBase;
import com.aspose.email.cloud.sdk.invoker.ApiException;
import com.aspose.email.cloud.sdk.model.*;
import com.aspose.email.cloud.sdk.model.requests.AddMapiAttachmentRequestData;
import com.aspose.email.cloud.sdk.model.requests.CreateMapiRequestData;
import com.aspose.email.cloud.sdk.model.requests.GetMapiPropertiesRequestData;
import com.aspose.email.cloud.sdk.model.requests.ObjectExistsRequestData;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.UUID;

public class HierarchicalMapiTests extends TestBase {
    @Test(groups = {"pipeline"})
    public void createMapiTest() throws ApiException {
        String fileName = UUID.randomUUID().toString() + ".msg";
        api.createMapi(new CreateMapiRequestData(
            fileName,
            new HierarchicalObjectRequest(
                new HierarchicalObject("IPM.Contact", null, Arrays.<BaseObject>asList(
                    new PrimitiveObject("Tag:'PidTagMessageClass':0x1A:String", null, "IPM.Contact"),
                    new PrimitiveObject("Tag:'PidTagSubject':0x37:String", null, "null"),
                    new PrimitiveObject("Tag:'PidTagSubjectPrefix':0x3D:String", null, null),
                    new PrimitiveObject("Tag:'PidTagMessageFlags':0xE07:Integer32", null, "8"),
                    new PrimitiveObject("Tag:'PidTagNormalizedSubject':0xE1D:String", null, null),
                    new PrimitiveObject("Tag:'PidTagBody':0x1000:String", null, null),
                    new PrimitiveObject("Tag:'PidTagStoreSupportMask':0x340D:Integer32", null, "265849"),
                    new PrimitiveObject("Tag:'PidTagSurname':0x3A11:String", null, "Surname"),
                    new PrimitiveObject("Tag:'PidTagOtherTelephoneNumber':0x3A1F:String", null, "+79123456789"),
                    new PrimitiveObject("Tag:'':0x6662:Integer32", null, "0"),
                    new PrimitiveObject("Lid:'PidLidAddressBookProviderArrayType':0x8029:Integer32:00062004-0000-0000-c000-000000000046", null, "1"))),
                new StorageFolderLocation(storage, folder))));
        assert api.objectExists(new ObjectExistsRequestData(folder + "/" + fileName, storage, null))
            .isExists();
    }

    @Test(groups = {"pipeline"})
    public void addMapiAttachment() throws ApiException {
        String calendar = createCalendar();
        String calendarAttachment = createCalendar();
        api.addMapiAttachment(new AddMapiAttachmentRequestData(calendar, calendarAttachment,
            new AddAttachmentRequest(
                new StorageFolderLocation(storage, folder),
                new StorageFolderLocation(storage, folder))));
    }

    @Test(groups = {"pipeline"})
    public void getMapiPropertiesTest() throws ApiException {
        String fileName = createCalendar();
        HierarchicalObjectResponse properties = api.getMapiProperties(new GetMapiPropertiesRequestData(fileName, folder, storage));
        assert properties.getHierarchicalObject().getName().contains("IPM.Schedule");
    }
}
