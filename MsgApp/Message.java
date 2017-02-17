package MsgApp;

import java.nio.ByteBuffer;

import headers.NetworkHeader;

public class Message
{
    public Message(int datalen)
    {
        ByteBuffer buffer = ByteBuffer.allocate(NetworkHeader.SIZE+datalen);
        hdr = new NetworkHeader(buffer);
        // move the ByteBuffer to after the header, *before* doing slice!
        // slice gives a new ByteBuffer that starts at current position of first buffer.
        buffer.position(NetworkHeader.SIZE);
        m_data = buffer.slice();
    }
    public Message(ByteBuffer buffer)
    {
        hdr = new NetworkHeader(buffer);
        // move the ByteBuffer to after the header, *before* doing slice!
        // slice gives a new ByteBuffer that starts at current position of first buffer.
        buffer.position(NetworkHeader.SIZE);
        m_data = buffer.slice();
    }
    public void SetMessageID(int id){ hdr.SetMessageID(id); }
    public long GetMessageID() { return hdr.GetMessageID(); }
    /*void InitializeTime()
    {
        // \todo How to set 32-bit rolling ms counter?
        hdr.SetTime(0);
    }*/

    protected NetworkHeader hdr;
    protected ByteBuffer m_data;
};
