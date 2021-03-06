%{
    <OUTPUTFILENAME>
    Created <DATE> from:
        Messages = <INPUTFILENAME>
        Template = <TEMPLATEFILENAME>
        Language = <LANGUAGEFILENAME>

                     AUTOGENERATED FILE, DO NOT EDIT

%}

classdef <MSGNAME>

    properties (Constant)
        SIZE = <MSGSIZE>;
        <ENUMERATIONS>
    end
    properties (Hidden)
        % the buffer of data
        m_data;
    end
    methods
        function obj = set.MessageID(obj, id)
            <SETMSGID>;
        end

        function id = get.MessageID(obj)
            id = <GETMSGID>;
        end

    end
    properties  (Dependent)
            MessageID;
            <DECLARATIONS>
    end
    methods
        function obj = <MSGNAME>(data)
            if nargin == 0
                % create a new message (allocates a buffer for it)
                obj.m_data = zeros(obj.SIZE, 1, 'uint8');
                <INIT_CODE>
            else
                % create a message based on a data buffer
                obj.m_data = data;
            end
        end
    end
    methods
        <ACCESSORS>
    end
end