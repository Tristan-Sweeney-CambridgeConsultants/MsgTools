/*
    <OUTPUTFILENAME>
    Created <DATE> from:
        Messages = <INPUTFILENAME>
        Template = <TEMPLATEFILENAME>
        Language = <LANGUAGEFILENAME>

                     AUTOGENERATED FILE, DO NOT EDIT

*/
#include <stdint.h>

#ifndef <MSGNAME>_H__
#define <MSGNAME>_H__

class <MSGNAME>Message : public Message
{
    public:
        enum { MSG_ID = <MSGID>};
        enum { MSG_SIZE = <MSGSIZE> };
        <MSGNAME>Message(int size=MSG_SIZE)
        : Message(size)
        {
            if(Exists())
            {
                SetPayloadLength(size);
                SetMessageID(MSG_ID);
                Init();
            }
        }
        void Init()
        {
            <INIT_CODE>
        }
        <ENUMERATIONS>
        <ACCESSORS>
};

#endif