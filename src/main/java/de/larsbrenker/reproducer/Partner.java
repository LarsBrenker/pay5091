package de.larsbrenker.reproducer;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(name="Partner", description="Partner information.", implementation = Partner.class)
public class Partner {

    @Schema(required = true, name = "partnerName", example = "Partner GmbH", description = "Name of the partner", implementation = String.class)
    private String partnerName;

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

}
