// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._FileType;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryFileTypesResponse;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _RepositorySoap_QueryFileTypesResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _FileType[] queryFileTypesResult;

    public _RepositorySoap_QueryFileTypesResponse()
    {
        super();
    }

    public _RepositorySoap_QueryFileTypesResponse(final _FileType[] queryFileTypesResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setQueryFileTypesResult(queryFileTypesResult);
    }

    public _FileType[] getQueryFileTypesResult()
    {
        return this.queryFileTypesResult;
    }

    public void setQueryFileTypesResult(_FileType[] value)
    {
        this.queryFileTypesResult = value;
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("QueryFileTypesResult"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _FileType complexObject0 = new _FileType();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.queryFileTypesResult = (_FileType[]) list0.toArray(new _FileType[list0.size()]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
